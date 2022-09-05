public class Ex02 {
//    참조 참조형 Reference Type
//  참조형은 기본적으로 java.lang.Object를 상속 받으면 참조형 , 선언한 자료형이 기본형이 아닌 경우에도 참조형
//    참조형에는 클래스형Class Type, 인터페이스형Interface Type, 배열형Array Type

    static class MyObject {
        private int index;

        MyObject(int index) {
            this.index = index;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }
    }

    public static class ClassType {
        public static void main(String[] args) {
            MyObject a = new MyObject(2);
            MyObject b = new MyObject(4);
            System.out.println(a.getIndex()); // "a" result is 2.
            a = b;
            System.out.println(a.getIndex()); // "a" result is 4.
            b.setIndex(6);
            System.out.println(a.getIndex()); // "a" result is 6.
        }
    }
//    b 객체의 멤버 변수 값을 바꿨지만 a 객체도 같은 객체를 참조하기 때문에 동일한 값을 출력

}

