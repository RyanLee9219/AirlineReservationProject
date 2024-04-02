public class Airplane {
    private final String[] airplaneList = {
            "1. KE123: 대한항공의 국제선 항공편 (서울(ICN) - 도쿄(HND))",
            "2. OZ456: 아시아나항공의 국제선 항공편 (서울(ICN) - 상하이(PVG))",
            "3. 7C789: 제주항공의 국내선 항공편 (서울(GMP) - 부산(PUS))",
            "4. BX987: 에어부산의 국내선 항공편 (서울(GMP) - 제주(CJU))",
            "5. TW234: 티웨이항공의 국제선 항공편 (서울(ICN) - 싱가포르(SIN))",
            "6. LJ567: 진에어의 국제선 항공편 (서울(ICN) - 하노이(HAN))",
            "7. ZE890: 이스타항공의 국제선 항공편 (서울(GMP) - 대만(TPE))",
            "8. LJ123: 진에어의 국내선 항공편 (서울(GMP) - 광주(KWJ))",
            "9. 7C345: 제주항공의 국내선 항공편 (부산(PUS) - 서울(GMP))",
            "10. BX678: 에어부산의 국제선 항공편 (부산(PUS) - 홍콩(HKG))",
            "11. TW901: 티웨이항공의 국제선 항공편 (서울(ICN) - 오사카(KIX))",
            "12. LJ432: 진에어의 국내선 항공편 (부산(PUS) - 제주(CJU))",
            "13. BX567: 에어부산의 국내선 항공편 (제주(CJU) - 서울(GMP))",
            "14. TW789: 티웨이항공의 국내선 항공편 (제주(CJU) - 부산(PUS))",
            "15. ZE234: 이스타항공의 국제선 항공편 (서울(ICN) - 방콕(BKK))",
            "16. OZ901: 아시아나항공의 국제선 항공편 (서울(ICN) - 파리(CDG))",
            "17. 7C678: 제주항공의 국내선 항공편 (광주(KWJ) - 서울(GMP))",
            "18. BX123: 에어부산의 국내선 항공편 (제주(CJU) - 부산(PUS))",
            "19. KE456: 대한항공의 국제선 항공편 (서울(ICN) - 로스앤젤레스(LAX))",
            "20. TW345: 티웨이항공의 국제선 항공편 (서울(ICN) - 태평양(PPT))"
    };
    private boolean[] reserveAvabileList = {    // 예약 가능한 여부 확인 리스트
            true,false,true,false,true,true,false,true,true,false,true,true,false,true,true,false,true,true,true,false
    };

    public String getAirplace(String i){    // 리스트 번호의 정보 받기
        return airplaneList[Integer.parseInt(i)];
    }
    public String[] getAirpleList(){    // 항공편 리스트 모두 받기
        return airplaneList;
    }
    public boolean[] getReserveAvabileList(){       // 예약 가능한 항공편 리스트 받기
        return reserveAvabileList;
    }
    public String getFlightCode(String n){  //  리스트 번호의 항공편 코드만 받기
        return airplaneList[Integer.parseInt(n)].substring(3,8);
    }
}
