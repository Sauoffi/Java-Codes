class factin {
        public static void main(String[] args){
        System.out.println(facto(5)); 
        }
        public static long facto(int num){
            if(num>=1){
                return num* facto(num-1);
            }else{
                return 1;
            }
        }
    }
    
