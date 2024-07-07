class Tester {

    public static int searchEmployeeId(int[] employeeIds, int employeeIdToBeSearched) {
        int left = 0;
        int right = employeeIds.length - 1;
        int numberOfIterations = 0;
        
        while (left <= right) {
            numberOfIterations++;
            int mid = (left + right) / 2;
            
            if (employeeIds[mid] == employeeIdToBeSearched) {
                return numberOfIterations;
            } else if (employeeIds[mid] < employeeIdToBeSearched) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return -1; // Employee ID not found
    }

    public static void main(String a[]) {
        int[] employeeIds = { 8011, 8012, 8015, 8016, 8020, 8022, 8025 };
        int employeeIdToBeSearched = 8022;
        
        int numberOfIterations = searchEmployeeId(employeeIds, employeeIdToBeSearched);
        
        if (numberOfIterations == -1)
            System.out.println("Employee Id " + employeeIdToBeSearched + " is not found!");
        else
            System.out.println("Employee Id " + employeeIdToBeSearched + " is found! Number of iterations : " + numberOfIterations);
    }
}
