class GoodMorning {
        public static void main(String[] args) {
        while (true) {
        System.out.println("How was your day?");
        try {
                Thread.sleep(60000);
        }
                catch(Exception ex) {
                System.out.println(ex);
                        }
                }
        }
}
