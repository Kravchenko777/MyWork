package com.xammax;

import org.junit.jupiter.api.Test;

import java.util.*;


public class ArrayTest {

    @Test
    void test11(){

        int[] n = new int[]{1,8,6,2,5,4,8,3,7};
        test11Method(n);
    }

    private int test11Method(int[] height){
        int result = 0;
        if(height.length>1){
            for(int i=0;i<height.length-1;i++){
                for(int j=i+1;j<height.length;j++){
                    int summ = 0;
                    if(height[j]>height[i]) summ = (j-i) * height[i];
                            else summ = (j-i) * height[j];
                    if(result<summ) result = summ;
                }
            }
        }


        return result;
    };

    private int test11Method2(int[] height){

        int result = 0;
        if(height.length>1) {

            int l = 0;
            int r = height.length -1;
            while (l < r) {
                // Calculating the max area
                result = Math.max(result,
                        Math.min(height[l], height[r]) * (r - l));

                if (height[l] < height[r])
                    l += 1;

                else
                    r -= 1;
            }
        }
        return result;
    };

    @Test
    void test15(){
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        test15method(nums);
    }

    public List<List<Integer>> test15method(int[] nums){
        HashSet<String> strings = new HashSet<>();
        List<Integer> minResult = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int z=j+1;z<nums.length;z++){
                        if((nums[i] + nums[j] + nums[z])==0){
                            String[] kkk = new String[3];
                            kkk[0] = String.valueOf(nums[i]);
                            kkk[1] =  String.valueOf(nums[j]);
                            kkk[2] =  String.valueOf(nums[z]);
                            Arrays.sort(kkk);
                            if(strings.add(kkk[0] + kkk[1]+kkk[2])) {
                                minResult = new ArrayList<>();
                                minResult.add(nums[i]);
                                minResult.add(nums[j]);
                                minResult.add(nums[z]);
                                result.add(minResult);
                            }
                        }

                }
            }
        }

        return result;
    }

    @Test
    void test16(){
        int[] nums = new int[]{1,1,1,0};
        threeSumClosest(nums,-100);
    }

    public int threeSumClosest(int[] nums, int target){
        int result = 0;
        int test = target;
            Arrays.sort(nums);
            for(int i=1;i<nums.length-1;i++){
                int mmm = nums[i-1] + nums[i] + nums[i+1];
                if(target - mmm < test) {
                    test = target - mmm;
                    result= mmm;
                }
            }



        return result;
    }

    @Test
    void test18(){

    }

    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(nums.length == 0)return res;
        int len = nums.length;
        Arrays.sort(nums);
        for(int i=0;i<len-3;i++){
            if (i> 0 && nums [i] == nums [i-1]) continue;
            for(int j=i+1;j<len-2;j++){
                if ((j> 1) && (i != j-1) && (nums [j] == nums [j-1])) continue;
                int left = j+1;
                int right = len-1;
                while(left<right){
                    int sum = nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum == target){
                        List<Integer> inner = new ArrayList<Integer>();
                        inner.add(nums[i]);
                        inner.add(nums[j]);
                        inner.add(nums[left]);
                        inner.add(nums[right]);
                        res.add(inner);
                        while (left <right && nums [left] == nums [left + 1]) left ++;
                        while (left <right && nums [right] == nums [right-1]) right--;
                        left++;
                        right--;
                    }else if(sum < target){
                        left++;
                    }else{
                        right--;
                    }
                }


            }
        }

        return res;
    }

    @Test
    void test31(){
        nextPermutation(new int[]{1,1,1,0});
    }
    public void nextPermutation(int[] nums) {
        int summ = 0;
        for(int i=nums.length-1;i>0;i--){

        }
    }

    @Test
    void test49(){
        groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String,List<String>> test = new HashMap<>();

        for(String s:strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            if(test.containsKey(String.valueOf(chars))){
                List<String> m = test.get(String.valueOf(chars));
                m.add(s);
                test.put(String.valueOf(chars),m);
            } else {
                List<String> m = new ArrayList<>();
                m.add(s);
                test.put(String.valueOf(chars),m);
            }
        }

        for(List<String> strings:test.values()){
            result.add(strings);
        }

        return result;

    }

    @Test
    void test55(){
        canJump(new int[]{3,2,1,0,4});
    }

    public void canJump(int[] nums) {

        System.out.println(helpCanJump(nums,nums.length,0));
    }

    private boolean helpCanJump(int[] nums, int size, int position){
        if(position >= size -1) return true;
        if(nums[position]==0) return false;

        for(int i=1;i<nums[position];i++){
            helpCanJump(nums,size,position+i);
        }

        return true;
    }

    @Test
    void test73(){
        setZeroes(new int[][]{{0,1,2,0},{3,4,5,2},{1,3,1,5}});
    }


    public void setZeroes(int[][] matrix) {
        List<Pair> pairs = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0) pairs.add(new Pair(i,j));
            }
        }
        System.out.println(pairs);

        for(Pair pair:pairs){
            for(int i=0;i<matrix.length;i++){
                matrix[i][pair.b]=0;
            }
            for(int i=0;i<matrix[0].length;i++){
                matrix[pair.a][i]=0;
            }
        }
        System.out.println(matrix);
    }

    public class Pair {
        public int a;
        public int b;

        public Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    @Test
    void test74(){
        searchMatrix(new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}},3);
    }


    public boolean searchMatrix(int[][] matrix, int target) {

        if(matrix.length==1){
            for(int i=0;i<matrix[0].length;i++){
                if(matrix[0][i]==target) return true;
            }
            return false;
        }

        int length = matrix.length;
        if(length%2==1){

        } else {

        }



        return false;

    }


    @Test
    void test78(){
        subsets(new int[]{1,2,3});
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        HashSet<List<Integer>> test = new HashSet<>();
        test.add(new ArrayList<>());
        for(int i=0;i<nums.length;i++){
            List<Integer> mmm = new ArrayList<>();
            mmm.add(nums[i]);
            test.add(mmm);

            for(int j=i+1;j<nums.length;j++){

            }
        }




        return res;
    }


}
