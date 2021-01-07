package leetcode.medium;

import java.util.Iterator;
import java.util.PriorityQueue;

/**
 * 973. K Closest Points to Origin (https://leetcode.com/problems/k-closest-points-to-origin/)
 */
public class KClosestPointsToOrigin {

    public int[][] kClosest(int[][] points, int K) {
        PriorityQueue<Point> pq = new PriorityQueue<>((p1, p2) -> p2.getEuclideanDistance() >= p1.getEuclideanDistance() ? 1 : -1);
        for (int[] p : points) {
            pq.add(new Point(p[0], p[1]));

            if (pq.size() > K)
                pq.poll();
        }

        int[][] res = new int[K][2];
        Iterator<Point> iter = pq.iterator();

        int index = 0;
        while (index < K) {
            Point p = iter.next();
            res[index][0] = p.X;
            res[index][1] = p.Y;
            index++;
        }

        return res;
    }
}

class Point {
    int X;
    int Y;

    Point(int _X, int _Y) {
        X = _X;
        Y = _Y;
    }

    double getEuclideanDistance() {
        return Math.sqrt(X * X + Y * Y);
    }
}
