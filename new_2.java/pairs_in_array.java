public class pairs_in_array {
    	public static void main(String[] args) {
		int[] a={1,3,4,2,6,8};
		int n=a.length;
		for(int i=0;i<n-2;i++){
		    for(int j=0;j<n-1;j++){
		        System.out.println(a[i]+","+a[j]);
		    }
		}
	}
}
