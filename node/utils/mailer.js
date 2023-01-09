var nodemailer = require('nodemailer');

var transporter = nodemailer.createTransport({
    service: 'gmail',
    auth: {
        user: "tbibi.pi@gmail.com",
        pass: "ktkltkykkjitevor"
    }
});

module.exports.sendVerifyMail = ((to,text) => {


    var mailOptions = {
        from: process.env.EMAIL,
        to: to ,
        subject: 'Sending Email using Node.js',
        text: text
    };

    transporter.sendMail(mailOptions, function (error, info) {
        if (error) {
            console.log(error);
        } else {
            console.log('Email sent: ' + info.response);
        }
    });
})
 