public class rev_of_string {
    public static void main(String[] args) {
	    String s="panda";
	    char[] s1=s.toCharArray();
		int l=0;
		int r=s.length()-1;
		while(l<r){
		    char temp=s1[l];
		    s1[l]=s1[r];
		    s1[r]=temp;
		    l++;
		    r--;
		}
		String rev=new String(s1);
		System.out.print(rev);
	}
}
