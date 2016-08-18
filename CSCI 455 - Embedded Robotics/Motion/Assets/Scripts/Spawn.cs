using UnityEngine;
using System.Collections;

public class Spawn : MonoBehaviour {


	// Use this for initialization
	void Start ()
    {
        transform.position = new Vector3(Random.Range(-3.0F, 3.0F), 2, Random.Range(-3.0F, 3.0F));
	}
	
	// Update is called once per frame
	void Update ()
    {
	
	}

}
