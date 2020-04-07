var usernameTextbox = document.querySelector('#username')

function errorAnimation () { 
	return new Promise( (resolve, reject) => {
		var i = 0
		console.log("Inside the promise")
		var animationInterval = setInterval(() => {
			i++
			usernameTextbox.style.backgroundColor = `rgb(${i}, 0, 0)`
			if (i >= 255) {
				clearInterval(animationInterval);
				console.log("Resolving promise")
				resolve("Done executing animation code")
			}
		}, 1)
	})
}

usernameTextbox.addEventListener('blur', () => {
	var user = {
			'username': usernameTextbox.value,
	}
	fetch('/users/exists', {
		method: 'POST',
		headers: {
			'Content-Type': 'application/json'
		},
		body: JSON.stringify(user)
	})
	.then( (responseEntity) => responseEntity.json() )
	.then( (data) => {
		if (data === true) {
			// this users already exists!
			console.log("username already exists")
			usernameTextbox.focus()
			usernameTextbox.select()
			
			errorAnimation().then( () => {
				console.log("We're now in the callback function")
				usernameTextbox.style.backgroundColor = 'rgb(255,255,255)'
			} )
		}
	})
})