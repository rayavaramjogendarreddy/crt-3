import java.util.Arrays;

public class finding_max_element {
    public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6,4,10};
		Arrays.sort(arr);
		System.out.println(arr[arr.length-1]);
	}
}
