
console.log(trackRobot());

function trackRobot(north = 30, south = 20, east = 10, west = 10) {
    let placement = [0, 0];

    // Mutate 2d array.
    placement[0] += north;
    placement[0] -= south;
    placement[1] += east;
    placement[1] -= west;

    return placement;
}