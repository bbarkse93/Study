package ex04;

public class CircleTest {
    public static void main(String[] args) {
        Circle obj1;
        obj1 = new Circle();

        obj1.radius = 100;
        obj1.color = "red";

        double area1 = obj1.getArea();
        // Circle에 return을 사용 하였기 때문에 obj.getArea를 area에 대입할 수 있다
        // Circle에 반환타입이 double이기때문에 area의 타입이 double이다.

        System.out.println("원의 면적 = " + area1);

        Circle obj2;
        obj2 = new Circle();

        obj2.radius = 200;
        obj2.color = "blue";

        double area2 = obj2.getArea();

        System.out.println("원의 면적 = " + area2);

    }
}
