//James Story james.story@malad.us

//for CTE software development 1

//instructor Mr Gross


class bubbleSort{

    

    public static int[] swapTwoArrayElements(int[] arrayToSwap, int lowerIndex){
    
                int temp;
    
    temp=arrayToSwap[lowerIndex];
    
    arrayToSwap[lowerIndex]=arrayToSwap[lowerIndex+1];
    
    arrayToSwap[lowerIndex+1]=temp;
    
    return arrayToSwap;
    
    }
    
    public static void main(String[] args){
    
    int[] arrayToSort={1,3,4,5,1,23,57,126,4,543,345,23,12,45,67,97};// this creates the array.
    
    }

    public static  bubbleSort.bubbleSort(int[]) {

        for(int i = 0; i < arrayToSort.length - 1; i++) {
            for(int j = 0; j < arrayToSort.length - i - 1; j++) {
                if(arrayToSort[j] < arrayToSort[j+1]) {
                    int temp = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[j+1];
                    arrayToSort[j+1] = temp;
    
                }
            }
        }
    }

    }