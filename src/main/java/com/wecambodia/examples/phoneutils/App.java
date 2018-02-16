package com.wecambodia.examples.phoneutils;

import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat;
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
    	
    	String invalidNumber = "123";
    	String validNumberForKh = "010111222";
    	String valideNumberForKr = "01011112222";
    	String normalized = null;
    	PhoneNumber parsed = null;
    	
    	System.out.println("** 캄보디아 (KH)");

    	System.out.println("1. 유효한 번호 테스트");
    	System.out.println("\n");

    	System.out.println("# 노말라이징 (입력 -> db)");
    	System.out.println("- 원본 : " + validNumberForKh);
    	System.out.println("- 유효성 검사 결과 : " + PhoneUtils.isValidNumber(validNumberForKh, "KH"));
    	
    	normalized = PhoneUtils.normalizeNumber(validNumberForKh, "KH");
    	System.out.println("- 노말라이징 결과 : " + normalized);
		System.out.println("\n");
    	
		parsed = PhoneUtils.parseNumber(normalized);
		System.out.println("# 파싱 (db -> 출력)");
		System.out.println("- 국가코드 (ISOAlpha2) : " + PhoneUtils.getCountryCodeAlpha2(parsed));
		System.out.println("- 국가코드 (숫자) : " + PhoneUtils.getCountryCodeNumeric(parsed));
		System.out.println("- 번호 (international 표준) : " + PhoneUtils.formatNumber(parsed, PhoneNumberFormat.INTERNATIONAL));
		System.out.println("- 번호 (international 숫자만) : " + PhoneUtils.formatNumberDigitsOnly(parsed, PhoneNumberFormat.INTERNATIONAL));
		System.out.println("- 번호 (national 표준) : " + PhoneUtils.formatNumber(validNumberForKh, "KH", PhoneNumberFormat.NATIONAL));
		System.out.println("- 번호 (national 숫자만) : " + PhoneUtils.formatNumberDigitsOnly(validNumberForKh, "KH", PhoneNumberFormat.NATIONAL));
		System.out.println("\n");
		
		System.out.println("2. 유효하지 않은 번호 테스트");
		System.out.println("\n");
		
		System.out.println("# 노말라이징 (입력 -> db)");
    	System.out.println("- 원본 : " + invalidNumber);
    	System.out.println("- 유효성 검사 결과 : " + PhoneUtils.isValidNumber(invalidNumber, "KH"));
    	
    	normalized = PhoneUtils.normalizeNumber(invalidNumber, "KH");
    	System.out.println("- 노말라이징 결과 : " + normalized);
    	System.out.println("\n");

    	parsed = PhoneUtils.parseNumber(normalized);
    	System.out.println("# 파싱 (db -> 출력)");
		System.out.println("- 국가코드 (ISOAlpha2) : " + PhoneUtils.getCountryCodeAlpha2(parsed));
		System.out.println("- 국가코드 (숫자) : " + PhoneUtils.getCountryCodeNumeric(parsed));
		System.out.println("- 번호 (international 표준) : " + PhoneUtils.formatNumber(invalidNumber, "KH", PhoneNumberFormat.INTERNATIONAL));
		System.out.println("- 번호 (international 숫자만) : " + PhoneUtils.formatNumberDigitsOnly(invalidNumber, "KH", PhoneNumberFormat.INTERNATIONAL));
		System.out.println("- 번호 (national 표준) : " + PhoneUtils.formatNumber(invalidNumber, "KH", PhoneNumberFormat.NATIONAL));
		System.out.println("- 번호 (national 숫자만) : " + PhoneUtils.formatNumberDigitsOnly(invalidNumber, "KH", PhoneNumberFormat.NATIONAL));
		System.out.println("\n");
		
		System.out.println("** 한국 (KR)");
		
		
		System.out.println("1. 유효한 번호 테스트");
		System.out.println("\n");
		
		System.out.println("# 노말라이징 (입력 -> db)");
    	System.out.println("- 원본 : " + valideNumberForKr);
    	System.out.println("- 유효성 검사 결과 : " + PhoneUtils.isValidNumber(valideNumberForKr, "KR"));
    	
    	normalized = PhoneUtils.normalizeNumber(valideNumberForKr, "KR");
    	System.out.println("- 노말라이징 결과 : " + normalized);
    	System.out.println("\n");
    	
    	parsed = PhoneUtils.parseNumber(normalized);
    	System.out.println("# 파싱 (db -> 출력)");
		System.out.println("- 국가코드 (ISOAlpha2) : " + PhoneUtils.getCountryCodeAlpha2(parsed));
		System.out.println("- 국가코드 (숫자) : " + PhoneUtils.getCountryCodeNumeric(parsed));
		System.out.println("- 번호 (international 표준) : " + PhoneUtils.formatNumber(valideNumberForKr, "KR", PhoneNumberFormat.INTERNATIONAL));
		System.out.println("- 번호 (international 숫자만) : " + PhoneUtils.formatNumberDigitsOnly(valideNumberForKr, "KR", PhoneNumberFormat.INTERNATIONAL));
		System.out.println("- 번호 (national 표준) : " + PhoneUtils.formatNumber(valideNumberForKr, "KR", PhoneNumberFormat.NATIONAL));
		System.out.println("- 번호 (national 숫자만) : " + PhoneUtils.formatNumberDigitsOnly(valideNumberForKr, "KR", PhoneNumberFormat.NATIONAL));
		System.out.println("\n");

		
		System.out.println("2. 유효하지 않은 번호 테스트");
		System.out.println("\n");
    	
		System.out.println("# 노말라이징 (입력 -> db)");
    	System.out.println("- 원본 : " + invalidNumber);
		
		normalized = PhoneUtils.normalizeNumber(invalidNumber, "KR");
		System.out.println("- 노말라이징 결과 : " + normalized);
		System.out.println("\n");

		parsed = PhoneUtils.parseNumber(normalized);
    	System.out.println("# 파싱 (db -> 출력)");
		System.out.println("- 국가코드 (ISOAlpha2) : " + PhoneUtils.getCountryCodeAlpha2(parsed));
		System.out.println("- 국가코드 (숫자) : " + PhoneUtils.getCountryCodeNumeric(parsed));
		System.out.println("- 번호 (international 표준) : " + PhoneUtils.formatNumber(invalidNumber, "KR", PhoneNumberFormat.INTERNATIONAL));
		System.out.println("- 번호 (international 숫자만) : " + PhoneUtils.formatNumberDigitsOnly(invalidNumber, "KR", PhoneNumberFormat.INTERNATIONAL));
		System.out.println("- 번호 (national 표준) : " + PhoneUtils.formatNumber(invalidNumber, "KR", PhoneNumberFormat.NATIONAL));
		System.out.println("- 번호 (national 숫자만) : " + PhoneUtils.formatNumberDigitsOnly(invalidNumber, "KR", PhoneNumberFormat.NATIONAL));
    }
}
