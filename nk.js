function nk() {
    const table = [];
    for (let i = 1; i <= 10; i++) {
        table.push(`5 x ${i} = ${5 * i}`);
    }
    return table.join("\n");
}

console.log(nk());
