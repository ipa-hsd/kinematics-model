#include "KinematicsValidator.h"

#include <iostream>


using namespace std;



JNIEXPORT jboolean JNICALL

Java_de_fraunhofer_ipa_kinematics_validation_KinematicsValidator_print(JNIEnv *, jobject){

    cout << "Oh Harsh, how handsome you are!\n";

    return false;

}
