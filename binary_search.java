public class binary_search {
     public static void main(String[] args){
        int a[]={1,2,8,5,6,7};
        int n=45;
        boolean flag=false;
        int l=0;
        int i=a.length-1;
        while(l<=i){
            int m=(l+i)/2;
            if(a[m]==n){
                flag=true;
            }
            else if(a[m]<n){
                l=m+1;
            }
            else if(a[m]>n){
                l=m-1;
            }
        }
        if(flag==true){
            System.out.println("found");
        }
        else{
            System.out.println("Not found");
        }
    }
}
