function submitForm() {
    var firstName = document.getElementById("firstName").value;
    var lastName = document.getElementById("lastName").value;
    var dob = document.getElementById("dob").value;
    var country = document.getElementById("country").value;
    var gender = [];
    if (document.getElementById("male").checked) {
        gender.push("Male");
    }
    if (document.getElementById("female").checked) {
        gender.push("Female");
    }
    var profession = document.getElementById("profession").value;
    var email = document.getElementById("email").value;
    var mobileNumber = document.getElementById("mobileNumber").value;

    // Perform form validation
    if (!firstName || !lastName || !dob || !country || gender.length === 0 || !profession || !email || !mobileNumber) {
        alert("Please fill out all fields.");
        return;
    }

    // Display values in a popup
    var popupContent = `<strong>First Name:</strong> ${firstName}<br>`;
    popupContent += `<strong>Last Name:</strong> ${lastName}<br>`;
    popupContent += `<strong>Date of Birth:</strong> ${dob}<br>`;
    popupContent += `<strong>Country:</strong> ${country}<br>`;
    popupContent += `<strong>Gender:</strong> ${gender.join(", ")}<br>`;
    popupContent += `<strong>Profession:</strong> ${profession}<br>`;
    popupContent += `<strong>Email:</strong> ${email}<br>`;
    popupContent += `<strong>Mobile Number:</strong> ${mobileNumber}<br>`;

    document.getElementById("popup-content").innerHTML = popupContent;
    document.getElementById("popup").style.display = "flex";
}

function resetForm() {
    document.getElementById("surveyForm").reset();
}

function closePopup() {
    document.getElementById("popup").style.display = "none";
}
