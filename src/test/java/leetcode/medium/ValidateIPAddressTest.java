package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ValidateIPAddressTest {

    @Test
    void testIpAddress() {
        assertEquals("Neither", ValidateIPAddress.validIPAddress("256.256.256.256"));
    }

    @Test
    void testIpAddress1() {
        assertEquals("IPv4", ValidateIPAddress.validIPAddress("172.16.254.1"));
    }

    @Test
    void testIpAddress2() {
        assertEquals("IPv6", ValidateIPAddress.validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334"));
    }

}