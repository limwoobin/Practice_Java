package DesignPattern.ex1;

public class FactoryPatternTest {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();
    }
}

/*
- 팩토리 메소드 패턴은 간단하게 객체 생성을 대신 수행해주는 공장(Factory)
- 객체는 직접 생성하는 경우가 있고 ,
  팩토리 메소드 패턴의 역할처럼 간접적으로 객체 생성 후 반환해주는 방식이 있음.

- 장점 : 생성할 클래스를 미리 알지 못해도 팩토리 클래스가 객체 생성 담당
        객체의 자료형이 하위클래스에 의해 결정 -> 확장 용이
        동일한 형태로 프로그래밍 가능
        확장성 있는 프로젝트 구성 가능

- 단점 : 객체가 늘어날 때 마다 하위클래스 재정의로 불필요한 많은 클래스 생성 가능성
*/