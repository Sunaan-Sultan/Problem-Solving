class Contains-Duplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet <Integer> hashset = new HashSet<>();

        for(int number : nums){
            if(hashset.contains(number)){
                return true;
            }else{
                hashset.add(number);
            }
        }
        return false;
    }
}