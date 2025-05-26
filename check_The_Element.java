public class check_The_Element
{
    public static int search(int[] arr,int n,int x){
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6};
		int x=3;
		int res=search(arr,arr.length,x);
		if(res==-1){
		    System.out.println("Element is not found in array");
		}
		else{
		    System.out.println("Element is found in arry of index");
		}
	}
}