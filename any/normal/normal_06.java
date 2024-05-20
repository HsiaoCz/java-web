package any.normal;

public class normal_06 {
    public static void main(String[] args) {
        // 二分查找
        // 线性排查
        // 对排过序的数据进行查找

        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };

        // 查询目标
        int targetNum = 5;
        int start = 0;
        int end = nums.length - 1;

        int middle = 0;

        while (start <= end) {
            middle = (start + end) / 2;
            if (nums[middle] > targetNum) {
                end = middle - 1;
            } else if (nums[middle] < targetNum) {
                end = middle + 1;
            } else {
                break;
            }
        }
    }
}
