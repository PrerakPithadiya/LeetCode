class Solution {
    public String destCity(List<List<String>> paths) {
        for (int j = paths.size() - 1; j >= 0; j--) {
            boolean isPresent = false;
            for (List<String> path : paths) {
                if (paths.get(j).get(1).equals(path.get(0))) {
                    isPresent = true;
                    break;
                }
            }
            if (!isPresent) {
                return paths.get(j).get(1);
            }
        }
        return null;
    }
}
