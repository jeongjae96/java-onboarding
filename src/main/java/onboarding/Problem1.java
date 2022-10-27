package onboarding;

import java.util.List;

/*
문제 설명
책
- 1-400 pg
- 왼쪽 pg 홀수, 오른쪽 pg 짝수
- 모든 페이지에 번호

게임의 규칙
1. 책을 임의로 펼친다
2. 왼쪽 페이지 번호의 각 자리 숫자를 모두 더하거나, 모두 곱해 가장 큰 수를 구한다.
3. 오른쪽 페이지 번호의 각 자리 숫자를 모두 더하거나, 모두 곱해 가장 큰 수를 구한다.
4. 2~3 과정에서 가장 큰 수를 본인의 점수로 한다.
5. 점수가 높은 사람이 게임의 승자가 된다.
6. 시작 면이나 마지막 면이 나오도록 책을 펼치지 않는다. ('[1,2] 또는 [399,400]이 나오면 안 된다'라는 의미로 받아들였다.)

return 값
1: 포비가 이긴 경우
2: 크롱이 이긴 경우
0: 무승부
-1: 예외사항
*/

/*
기능 목록
- 각자의 점수를 구하기 (각 자리 숫자를 모두 더하거나, 모두 곱해 가장 큰 수 구하기)
- 각자의 점수 비교 (승자 정하기)
- 예외사항 제외 (나올 수 있는 페이지의 범위, 시작 면/마지막 면 x, 왼쪽 홀수 & 오른쪽 짝수, 페이지 번호는 순서대로)
*/

class Problem1 {

    // 예외사항을 확인하기 위한 메서드
    public static boolean isCheck(List<Integer> pages) {
        if (pages.get(0) + 1 != pages.get(1)) {return false;} // 페이지가 순서대로 들어있지 않은 경우, false 반환.

        for (int i = 0; i < pages.size(); i++) {
            if (pages.get(i) <= 2 && pages.get(i) >= 399) {return false;} // 나올 수 있는 페이지의 범위 수를 넘어서는 경우, false 반환.
            if (pages.get(i) % 2 == i) {return false;} // 왼쪽 페이지 -> 짝수, 오른쪽 페이지 -> 홀수가 나온 경우, false 반환.
        }

        return true;
    }

    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;
        
        // 예외사항 있을 시, -1 반환.
        if (!(isCheck(pobi) && isCheck(crong))) {return -1;}
        
        return answer;
    }
}