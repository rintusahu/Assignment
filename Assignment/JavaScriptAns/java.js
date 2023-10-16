// function reverse(str,substr){
//   return str.split(substr).reverse().join(substr);
// }

// let str = "java is high-level programming language";
// let str1 = reverse(str,"");
// let str2 = reverse(str1," ");
// console.log(str2);

function sort(arr){
  for(let i=0; i<arr.length-1; i++){
	  for(let j=0;j<arr.length-1-i;j++){
		if(arr[j]>arr[j+1]){
			let temp = arr[j];
			arr[j] = arr[j+1];
			arr[j+1]= temp;
	  }
	}
  }
  console.log("sorted elements=["+arr+"]");
}
const arr2 = [54,23,12,97,75,100,42]; 
sort(arr2);

