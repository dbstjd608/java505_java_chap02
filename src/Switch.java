import java.util.Calendar;
import java.util.Date;

public class Switch {
    public static void main(String[] args) {
        char grade = 'F';

        switch (grade){
            case 'A':
                System.out.println("축하합니다");
                System.out.println("잘 하셨습니다");
                break;

            case 'B':
                System.out.println("좋아요");
                break;

            case 'C':
                System.out.println("노력하세요");
                break;

            case 'D':
                System.out.println("위험합니다");
                break;

//            case 'F':
//                System.out.println("탈락입니다");
//                break;
            default:
                System.out.println("탈락입니당");
                break;
        }
        System.out.println("\n\n");


        //        자바의 날짜관련 클래스
        Calendar cal = Calendar.getInstance();
        //        현재시간을 날짜 클래스에 적용
        cal.setTime(new Date());
        //        현재날짜를 기준으로 일주일중 오늘 요일을 가져옴
        int currDay = cal.get(Calendar.DAY_OF_WEEK);

        System.out.println("변수 currDay의 값 : " + currDay);

        switch (currDay) {
            case 1:
                System.out.println("오늘은 일요일 입니다");
                break;

            case 2:
                System.out.println("오늘은 월요일 입니다");
                break;

            case 3:
                System.out.println("오늘은 화요일 입니다");
                break;

            case 4:
                System.out.println("오늘은 수요일 입니다");
                break;

            case 5:
                System.out.println("오늘은 목요일 입니다");
                break;

            case 6:
                System.out.println("오늘은 금요일 입니다");
                break;

            case 7:
                System.out.println("오늘은 토요일 입니다");
                break;



        }
    }
}
