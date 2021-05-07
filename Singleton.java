package Package;

public class Singleton {

        private static Singleton instance;
        private Singleton() {

            // TODO Auto-generated constructor stub
        }


        public static Singleton getInstance() {
            if(instance == null) {
                instance = new Singleton();

            }

            return instance;
        }

        public void conn(String message){
            message = "Add bot"
                    System.out.println(message);

        }
    public void errorMessage(String message){
        message = "Ne mojesh da dobawish tazi duma"
        System.out.println(message);

    }


}
