package solutions;

public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] prefixProduct = getPrefixProductArray(nums);
        int[] suffixProduct = getSuffixProductArray(nums);

        return multiplyPrefixWithSuffixForEach(nums, prefixProduct, suffixProduct);
    }

    private int[] getPrefixProductArray(int[] nums) {
        int[] prefixProduct = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                prefixProduct[i] = nums[i];
            } else {
                prefixProduct[i] = nums[i] * prefixProduct[i -1];
            }
        }
        return prefixProduct;
    }

    private int[] getSuffixProductArray(int[] nums) {
        int[] suffixProduct = new int[nums.length];
        for (int i = nums.length -1; i >= 0; i--) {
            if (i == nums.length - 1) {
                suffixProduct[i] = nums[i];
            } else {
                suffixProduct[i] = nums[i] * suffixProduct[i + 1];
            }
        }
        return suffixProduct;
    }

    private int[] multiplyPrefixWithSuffixForEach(int[] nums, int[] prefixProduct, int[] suffixProduct) {
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                nums[i] = suffixProduct[i + 1];
            } else if (i == nums.length - 1) {
                nums[i] = prefixProduct[i - 1];
            } else {
                nums[i] = prefixProduct[i - 1] * suffixProduct[i + 1];
            }
        }
        return nums;
    }
}
