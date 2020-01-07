class NomorSatu{
    public static void main(String[] args) {
        int kg=1, pon=1;
        
        for(int i=0;i<100;i++){
            pon = kg*2;
            System.out.println(kg++ + " Kg   =   "+pon++ +" Pon");
        }
    }
}