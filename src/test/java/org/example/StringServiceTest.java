package org.example;

import org.example.services.StringService;
import org.example.util.StringUtils;
import org.mockito.InjectMocks;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.openMocks;
import static org.testng.Assert.assertTrue;

public class StringServiceTest {

    @Mock
    StringUtils stringUtils;

    @InjectMocks
    StringService stringService;

    @BeforeMethod
    public void setup() {

        openMocks(this);
    }

    @Test
    public void testIsPalindrome() {

        when(stringUtils.convertToLowerCase("madam")).thenReturn("madam");
        boolean result = stringService.isPalindrome("madam");
        assertTrue(result);

        verify(stringUtils).convertToLowerCase("madam");
    }

}
