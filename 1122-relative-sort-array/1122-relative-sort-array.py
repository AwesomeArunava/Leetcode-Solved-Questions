class Solution:
    def relativeSortArray(self, arr1: List[int], arr2: List[int]) -> List[int]:
        output=[]
        extra=arr1.copy()
        
        for i in arr2:
            for j in arr1:
                if i == j:
                    output.append(j)
        extra.sort()
        
        for i in output:
            for j in extra:
                if i==j:
                    extra.remove(j)
        
        return output+extra