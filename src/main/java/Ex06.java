public class Ex06 {
//    스트림 람다식(Lambda)

    public static void main(String[] args) {

        //기본 자바 문법
        String move = new Thread(new Moveable() {
            @Override
            public void run() {
                System.out.println("move move original java way");
            }
        }).start();

    //람다 식 문법
        new Thread(()->{
            System.out.println("move move Lambda way");
        }).start();

    }

}
