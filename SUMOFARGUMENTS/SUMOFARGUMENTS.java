public class SUMOFARGUMENTS {
    public static void main(String[] args) {
        int n= args.length;
        int sum=0;
        for(int i=0 ; i<n ; i++){
            sum+=Integer.parseInt(args[i]);
        }
        System.out.print("The sum of entered arguments is : "+sum);
    }
}
