package CheckedCustomException;

class DuplicateElementException extends Exception {
	public DuplicateElementException(String msg) {
		super(msg);
	}
}

public class DuplicateArrayElement {

	public static void findDuplicate() throws DuplicateElementException {
		int arr[] = {23,4,12,8,10,4,76,80,10};
		for(int i=0; i<arr.length; i++) {
			for(int j=1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					System.out.println(arr[i]);
					throw new DuplicateElementException("Element is duplicate");
				}
			}
		}
	}
	public static void main(String[] args) {

		try {
			findDuplicate();
		} catch(DuplicateElementException e) {
			System.out.println(e);
		}
	}
}
