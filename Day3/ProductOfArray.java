package Day3;

public class ProductOfArray {
    public int[] findProductOfArrayExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        // Initialize the result array with 1
        for (int i = 0; i < n; i++) {
            result[i] = 1;
        }
        
        // Calculate the product of elements to the left of each index
        int leftProduct = 1;
        for (int i = 0; i < n; i++) {
            result[i] *= leftProduct;
            leftProduct *= nums[i];
        }
        
        // Calculate the product of elements to the right of each index
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= nums[i];
        }
        
        return result;
    }

    public static void main(String[] args) {
        ProductOfArray sol = new ProductOfArray();
        int[] input = {1,2, 3, 4,5};
        int[] output = sol.findProductOfArrayExceptSelf(input);
        
        for (int num : output) {
            System.out.print(num + " ");
        }
    }
}

