
console.log(detectTriangles());

function detectTriangles(one = [1, 1, 1], two = [1, 1, 2]) {
    one.sort;
    two.sort;

    // Check for valid triangles.
    if(one[0] + one[1] < one[2] || two[0] + two[1] < two[2]) {return false}
    // Check the triangle against the largest side. The second triangle has to be bigger than the first one.
    if(one[2] < two[2]) {return true;} else { return false }
}