function fn() {
function random_email(s) {
        var text = "";
        var str = "abcdefghijklmnopqrstuvwxyz";
        for (let i = 0; i < s; i++) {
            text += str.charAt(Math.floor(Math.random() * str.length));
        }
        return text + "@example.com";
    };

    var config = {
        baseurl: "https://simple-books-api.glitch.me",
        myName: "vikas",
        BearerToken: "92349d4601f50aafc4ab15f6c802c2b029fb8d351630d080aac886ddfd948cff",
        GetReq: "/books/1",
        Gen_token: "/api-clients/",
        Post_req:"/orders",
        getRandomEmail: random_email(8)

    };

    return config;
}




