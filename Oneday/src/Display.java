public class Display {


    //오프닝
    public void opening() {
        System.out.println("자이제 시작이야 내꿈을");
        System.out.println("내꿈을 위한 여행 택시맨~");
        System.out.println("이제부터 택시맨의 일주일이 시작된다");
        System.out.println("렛츠 기릿~~~~~~~~");
        System.out.println("------------------------------------------");
    }


    /*
     * 공통부분
     * 반복해서 쓰는 부분
     * */

    //스탯
    public void stat(int money, int stress, int day, int time) {
        int hour = time / 2;
        int min = (time % 2) * 30;
        //time클래스에서 48시간으로 받음
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.printf("소지금액 : %7d 원   | 스트레스 : %3d / 100   | %1d 일 째   | 시간 : %02d 시 %02d 분 \n", money, stress, day, hour, min);
        System.out.println("---------------------------------------------------------------------------------------------");
    }

    //메인메뉴 위드 톹호
    public void mainMenuToto() {
        System.out.println("골라골라 이중에서 골라");
        System.out.println("1. 운행      2. 식사");
        System.out.println("3. 휴식      4. 토토");
    }

    //메인메뉴 위다웃 톹호(다른 방법 없을까)
    public void mainMenu() {
        System.out.println("골라골라 이중에서 골라");
        System.out.println("1. 운행      2. 식사      3. 휴식");
    }

    //스트레스+
    public void printIncreaseStress(int stress) {
        System.out.println("스트레스가" + stress + " 만큼 증가했습니다.");
    }

    //스트레스-
    public void printDecreaseStress(int stress) {
        System.out.println("스트레스가" + stress + " 만큼  감소했습니다.");
    }

    //돈+
    public void printIncreaseMoney(int money) {
        System.out.println("소지금액이" + money + " 원 만큼 증가했습니다.");
    }

    //돈-
    public void printDecreaseMoney(int money) {
        System.out.println("소지금액이" + money + " 원 만큼 감소했습니다.");
    }

    //시간+
    public void printIncreaseTime(int time) {
        int hour = time / 2;
        int min = (time % 2) * 30;
        //time클래스에서 48시간으로 받음
        System.out.println("시간이 " + hour + " 시간 " + min + " 분" + " 만큼 증가했습니다.");
    }



    /*
     * 하루 루틴에서 출력만 하는거
     * */


    //기상
    public void getup() {
        System.out.println("아침이닷! 일어나자");
        System.out.println("더자고싶다 ");
    }

    //취침
    public void sleep() {
        System.out.println("자러갑니다 쿨쿨쿨 낼봐염");
    }

    /* 1. 운행
     */

    //일 스땃뜨
    public void startWork() {
        System.out.println("요, 택시맨~~ 오늘 하루 일을 시작합니다~~");
        //손님이 부른다
        System.out.println("\"??? : 택시이이이이~~~~\"");
        System.out.println("앗싸 손님~~~ 재빨리 손님 앞에 차를 댄다.");
        //손님 탄다.
        System.out.println("ㅇㅇㅇ(여기다 변수) 한 손님이 탑승했다ch!");
    }

    // 손님 내릴때(손님 별로 따로 멘트?)
    public void byeCustomer() {
        System.out.println("목적지에 도착했다.");
        //이 뒤에 돈,스트레스,시간 메소드 사용?
    }

    /*2. 식사
     */

    //식사 선택지
    public void chooseMeal() {
        System.out.println("식사 골라여");
        System.out.println("1. 도시락     2. 기사식당      3. 애슐리      4. 인터불고 호텔 뷔페");
    }

    //1. 도시락
    public void lunchbox(int stress) {
        System.out.println("도시락을 선택했다.");
        System.out.println("아껴야 산다!");
        System.out.println("냠냠쩝쩝");
        System.out.println("스트레스 : - " + stress+ " 돈 :  -0 원");
        //이 뒤에 돈 스트레스 시간 메소드 사용?
    }

    //2. 기사식당
    public void gisa(int stress,int money) {
        System.out.println("기사식당을 선택했다.");
        System.out.println("가성비 만족쓰");
        System.out.println("냠냠쩝쩝");
        System.out.println("스트레스 :  - " + stress+ " 돈 : -"+money +"원");
    }

    public void ashley(int stress,int money) {
        System.out.println("애슐리를 선택했다.");
        System.out.println("오늘은 좀 고급지게 먹어볼까나!");
        System.out.println("냠냠쩝쩝");
        System.out.println("스트레스 : - " + stress+ " 돈 : -"+money+"원");
        //이 뒤에 돈 스트레스 시간 메소드 사용?
    }

    public void hotelBuffet(int stress,int money) {
        System.out.println("인터불고 호텔 뷔페를 선택했다.");
        System.out.println("Flex~~ 해버렸지 뭐야아~~");
        System.out.println("냠냠쩝쩝");
        System.out.println("스트레스 : - " + stress+ " 돈 : -"+money+"원");
        //이 뒤에 돈 스트레스 시간 메소드 사용?
    }

    //3. 휴식
    public void rest() {
        System.out.println("휴식을 취합니다.");
    }


    /*
     * 4. 토토 구매시 사용
     *
     * */

    //오전-토토 구매 할때
    public void beforeBuyToto() {
        System.out.println("토토를 구매하시겠습니까? (1.구매 2.안구매)");
    }

    public void afterBuyToto() {
        System.out.println("토토를 구매하였습니다.");
        System.out.println(" 한국은 일본에 (1.승 / 2.무 / 3.패)");
    }

    //오후-토토 결과 발표
    public void resultToto(int result) {
        System.out.println("오늘의 토토 결과입니다!!! ");
        System.out.print("오늘 한국 대 일본 경기결과는 ");
        if(result ==1) {
        	System.out.print("한국 승입니다. ");
        }else if(result ==2) {
        	System.out.print("비겼습니다.");
        }else if(result ==3) {
        	System.out.print("한국 패입니다. ");
        }

    }

    //오후-토토 당첨!
    public void winToto() {
        System.out.println(">>>>>>>>>>당첨~!!!!!대박!!!!!!!!<<<<<<<<< ");
        System.out.println("축하드립니다 ");
        
    }

    //오후-토토 꽝!
    public void loseToto() {
        System.out.println(">>>>>>>>>>>>아이고 망했다 !!!<<<<<<<<<");
        System.out.println("꽝광꽝꽝꽈라꽝꽝꽝꽝 흑흐흐그그흑흑 돈을 잃으셨습니다.");
    }

    /*
     * 엔딩시 사용
     * 엔딩에서 사용하잣
     * */


    //엔딩
    public void ending(int ending) {

        switch (ending) {
            case 1:
                System.out.println("성공 대성공");
                System.out.println("- THE END -");

                break;
            case 2:
                System.out.println("파산 대똥망");
                System.out.println("- THE END -");
                break;
            case 3:
                System.out.println("사망 대사망");
                System.out.println("- THE END -");
                break;
            default:
                System.out.println("노말 엔딩쓰");
                System.out.println("- THE END -");
                break;
        }

    }
}
