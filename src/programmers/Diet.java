package programmers;

public class Diet {
    public static void main(String[] args) {
        // 변수생성
        double w = 81.6;
        double t = 1.76;

        // BMI계산
        double bmi = calculate(w, t);

        // 결과 출력
        System.out.printf("BMI: %.2f(%.1fkg, %.2fm\n)", bmi, w, t);
        System.out.printf("결과: %s입니다.\n", result(bmi));
    }

    public static double calculate(double weight, double tall) {
        double bmi = weight / (tall * tall);
        return bmi;

    }

    public static String result(double bmi) {
        String result = "";
        if (bmi < 24.9) {
            result = "저체중";
        } else if (bmi < 25) {
            result = "최적 범위";
        } else if (bmi < 30) {
            result = "과체중";
        } else if (bmi < 35) {
            result = "1급 비만";
        } else if (bmi < 40) {
            result = "2급 비만";
        } else {
            result = "3급 비만";
        }
        return result;
    }
}
