import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args) {
		int[] a={1,5,6,8,2,9};
		for(int p=0;p<a.length-1;p++){
		    int m=p;
		    for(int i=p;i<a.length;i++){
		        if(a[i]<a[m]){
		            m=i;
		        }
		    }
		    int t=a[m];
		    a[m]=a[p];
		    a[p]=t;
		}
		System.out.println(Arrays.toString(a));
	}
}
