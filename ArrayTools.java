public class ArrayTools {

	public static void fillArray(int arr[],int min,int max){		 
		for (int i = 0; i < arr.length; i++) {
			arr[i]=min+(int)(Math.random()*(max-min+1));
		}				
	}
	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	System.out.println();
	}
	public static int maxIndexInArray(int arr[]) {
		int maxIndex=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>arr[maxIndex]){
				maxIndex=i;
			}			
		}
		return maxIndex;
	}
	public static int maxInArray(int arr[]) {
		int max=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max){
				max=arr[i];
			}
		}
		return max;
	}
	public static int minInArray(int arr[]) {
		int min=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<min){
				min=arr[i];
			}
		}
		return min;
	}	
	public static int minIndexInArray(int arr[]) {
		int minIndex=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<arr[minIndex]){
				minIndex=i;
			}
		}
		return minIndex;
	}
    public static void bubleSort(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			 for (int j = 0; j < arr.length; j++) {
				 if(arr[j]>arr[j+1]){
		        	   int temp=arr[j];
		        	   arr[j]=arr[j+1];
		        	   arr[j+1]=temp;
		           }
			}	 	
		}
	}
    public static int minInRange(int arr[],int start) {
    	int min=start;
    	for (int i = start+1; i < arr.length; i++) {
    		if(arr[i]<arr[min]){
    			min=i;
    		}
		}    	    	
    	return min;
    }
    public static void selectionSort(int arr[]) {
    	int temp;
    	for (int i = 0; i < arr.length; i++) {
    		int min=minInRange(arr,i);
			temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
    }
	public static int binarySearch(int arr[],int num) {		
		int mid;
		for (int l = 0, r=arr.length-1; l <= r;) {
			mid=(l+r)/2;
			if(arr[mid]==num){
				return mid;
			}
		    if(arr[mid]>num){
		    	r=mid-1;
		    }
		    if(arr[mid]<num){
		    	l=mid+1;
		    }
		}								
			return -1;	
	}
	public static int search(int arr[],int num){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==num){
				return i;
			}
		}
	   return -1 ;
	}
	public static int sumArray(int arr[]){
		int res=0;
		for(int i=0;i<arr.length;i++){
			res=res+arr[i];
		}
	   return res;
	}
}}
