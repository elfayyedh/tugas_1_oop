#include <iostream>
using namespace std;

int main(){
	int i, j;
	float phi = 3.14;
	char pil;
	bool kondisi = true;
	string kata = "teks";
	
	for(i = 0; i < 5; i++){
		if(kondisi == true){
			cout << kata << endl;
		}
	}
	
	cout << endl;
	i = 0;
	while(i < 3){
		cout << phi << " * " << i << " = " << phi * i << endl;
		i++;
	}
	
	cout << endl;
	do{
		cout << kata << endl;
		cout << "Apakah anda ingin mengulang kata tersebut?\n";
		cout << "(y/n)\n";
		cin >> pil;
	}
	while(pil == 'y' || pil == 'Y');
	
	cout << endl;
	int array[3] = {1,2,3};
	for(i = 0; i < 3; i++){
		cout << array[i] << endl;
	}
	
	cout << endl;
	int Arr[2][2] = {1,2,3,4};
	for(i = 0; i < 2; i++){
		for(j = 0; j < 2; j++){
			cout << Arr[i][j];
		}
		cout << endl;
	}
	
	//ini adalah komen satu baris
	
	/*ini adalah
	komen multiple line*/
}
