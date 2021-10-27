// What is the Big O of the below function? (Hint, you may want to go line by line)
function anotherFunChallenge(input) {
    let a = 5;                          //O(1)
    let b = 10;                         //O(1)
    let c = 50;                         //O(1)
    for (let i = 0; i < input; i++) {   //O(1)
        let x = i + 1;                  //O(n)
        let y = i + 2;                  //O(n)
        let z = i + 3;                  //O(n)

    }
    for (let j = 0; j < input; j++) {   //O(1)
        let p = j * 2;                  //O(n)
        let q = j * 2;                  //O(n)
    }
    let whoAmI = "I don't know";        //O(1)
}

// 6 x O(1) + 5 x O(n)
//O(6 + 5n)