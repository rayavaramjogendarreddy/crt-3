public class unique_pairs_in_list {
    	public static void main(String[] args) {
		int[] a={1,3,4,2,6,8};
		int n=a.length;
		int i=0;
		int j=1;
		while(j<n){
		    System.out.println(a[i]+","+a[j]);
		    i++;
		    j++;
		}
	}
}
