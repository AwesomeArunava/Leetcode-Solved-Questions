/**
 * @param {number[]} heights
 * @return {number}
 */
var heightChecker = function(heights) {
    var dontMatch = 0;
    var expected = heights.slice();
    expected.sort(function(a, b) {
  return a - b;
});
    for(var i =0; i<heights.length; i++){
        if(heights[i] != expected[i]) {
            dontMatch++;
        }
    }
    return dontMatch;
};