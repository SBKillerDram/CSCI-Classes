using UnityEngine;
using UnityEngine.UI;
using System.Collections;
using System.IO;
using System.IO.Ports;
using System.Threading;

public class PlayerController : MonoBehaviour {

    public float speed;
    private Rigidbody rb;
    private int count;
    public Text countText;
    public Text winText;
	public Text check;
    public GameObject cube;
    private string dir;
    private Vector3 direction;
    private Quaternion rotation;
	private static SerialPort sp = new SerialPort("COM1", 115200, Parity.None, 8, StopBits.One);
	//private sbyte[] data = new sbyte[1];
	private string data;

    void Start()
    {
		//OpenConnection();
        rb = GetComponent<Rigidbody>();
        count = 0;
        winText.text = "";
		sp.Open ();
		check.text = "";
    }

	void FixedUpdate()
    {
        findCube();
        setCountText();
		countText.text = dir + " " + count;
		serialWrite ();
        float moveHorizontal = Input.GetAxis("Horizontal");
        float moveVertical = Input.GetAxis("Vertical");

        Vector3 movement = new Vector3(moveHorizontal, 0.0f, moveVertical);

        rb.AddForce(movement * speed);
    }

    void OnTriggerEnter(Collider other)
    {
        if(other.gameObject.CompareTag("Pickup"))
        {
            other.gameObject.SetActive(false);
            count = count + 1;
            setCountText();
        }
    }

    void setCountText()
    {
        //countText.text = "Count: " + count.ToString();
        float cy = rotation.eulerAngles.y;
        cy = Mathf.Round(cy * 100f) / 100f;
        float py = transform.eulerAngles.y;
        py = Mathf.Round(py * 100f) / 100f;
        float fy = cy - py;
        //countText.text = rotation.eulerAngles.y.ToString();
        if (count == 0)
        {
			if (-5.00 <= fy && fy <= 5.00) {
				dir = "Go straight";
				//data [0] = (sbyte)'w';
				data = "w";
			} //else if (180 < fy && fy < 360) {
				//dir = "Turn left";
				//data [0] = (sbyte)'a';
				//data = "a";
			else if (-5.01 > fy) {
				dir = "Turn Left";
				//data [0] = (sbyte)'a';
				data = "a";
			} else if (5.01 < fy) {
				dir = "Turn Right";
				//data [0] = (sbyte)'d';
				data = "d";
			}
        }
        else if (count >= 1)
        {
            dir = "";
            winText.text = "You Win";
        }
    }

    void findCube()
    {
        Vector3 relativePos = cube.transform.position - transform.position;
        rotation = Quaternion.LookRotation(relativePos);
        //print(rotation.eulerAngles);
        //print(transform.eulerAngles);
    }

	/*public void OpenConnection() 
	{
		if (sp != null) 
		{
			if (sp.IsOpen) 
			{
				sp.Close();
				//message = "Closing port, because it was already open!";
			}
			else 
			{
				sp.Open();  // opens the connection
				check.text = "port opened";
				sp.ReadTimeout = 50;  // sets the timeout value before reporting error
				//message = "Port Opened!";
			}
		}
		else 
		{
			if (sp.IsOpen)
			{
				check.text = "Port is already open";
			}
			else 
			{
				check.text = "Port == null";
			}
		}
	}
	*/
	public void serialWrite()
	{
		if (sp.IsOpen == false) {
			try{
				sp.Open();
				sp.Write(data);
			}catch
			{
				foreach(string str in SerialPort.GetPortNames())
				{
					check.text = string.Format("Existing COM port: {0}", str);
				}
				//check.text = "port not opened";
			}
		} else
			sp.Write (data);

	}
}