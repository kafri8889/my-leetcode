/**
 * @param {number} millis
 * @return {Promise}
 */
async function sleep(millis) {
    let date = Date.now();
    while (true) {
        if (Date.now() == date + millis) break;
    }
}

/** 
 * let t = Date.now()
 * sleep(100).then(() => console.log(Date.now() - t)) // 100
 */