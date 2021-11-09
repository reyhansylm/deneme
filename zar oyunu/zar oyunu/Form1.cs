using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace zar_oyunu
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }
        Random rastgele = new Random();
        int toplamben = 0;
        int toplampc = 0;


        private void button1_Click(object sender, EventArgs e)
        {
            button1.Enabled = false;
            button2.Enabled = true;
            
            int a = rastgele.Next(1, 7);
            int b = rastgele.Next(1, 7);

            if (a == 1)
            {
                pictureBox1.ImageLocation = "C:\\Users\\LENOVO\\Desktop\\1.jpg";
            }

            if (a == 2)
            {
                pictureBox1.ImageLocation = "C:\\Users\\LENOVO\\Desktop\\2.jpg";

            }

            if (a == 3)
            {
                pictureBox1.ImageLocation = "C:\\Users\\LENOVO\\Desktop\\3.jpg";

            }

            if (a == 4)
            {
                pictureBox1.ImageLocation = "C:\\Users\\LENOVO\\Desktop\\4.jpg";

            }

            if (a == 5)
            {
                pictureBox1.ImageLocation = "C:\\Users\\LENOVO\\Desktop\\5.jpg";

            }

            if (a == 6)
            {
                pictureBox1.ImageLocation = "C:\\Users\\LENOVO\\Desktop\\6.jpg";
            }



            if (b == 1)
            {
                pictureBox2.ImageLocation = "C:\\Users\\LENOVO\\Desktop\\1.jpg";
            }

            if (b == 2)
            {
                pictureBox2.ImageLocation = "C:\\Users\\LENOVO\\Desktop\\2.jpg";

            }

            if (b == 3)
            {
                pictureBox2.ImageLocation = "C:\\Users\\LENOVO\\Desktop\\3.jpg";

            }

            if (b == 4)
            {
                pictureBox2.ImageLocation = "C:\\Users\\LENOVO\\Desktop\\4.jpg";

            }

            if (b == 5)
            {
                pictureBox2.ImageLocation = "C:\\Users\\LENOVO\\Desktop\\5.jpg";

            }

            if (b == 6)
            {
                pictureBox2.ImageLocation = "C:\\Users\\LENOVO\\Desktop\\6.jpg";
            }

            toplamben = toplamben + a + b;
            label16.Text = toplamben.ToString();

            label3.Text = a.ToString();
            label4.Text = b.ToString();

        }

        private void button2_Click(object sender, EventArgs e)
        {
            button1.Enabled = true;
            button2.Enabled = false;

            int c = rastgele.Next(1, 7);
            int d = rastgele.Next(1, 7);

            if (c == 1)
            {
                pictureBox1.ImageLocation = "C:\\Users\\LENOVO\\Desktop\\1.jpg";
            }

            if (c == 2)
            {
                pictureBox1.ImageLocation = "C:\\Users\\LENOVO\\Desktop\\2.jpg";

            }

            if (c == 3)
            {
                pictureBox1.ImageLocation = "C:\\Users\\LENOVO\\Desktop\\3.jpg";

            }

            if (c == 4)
            {
                pictureBox1.ImageLocation = "C:\\Users\\LENOVO\\Desktop\\4.jpg";

            }

            if (c == 5)
            {
                pictureBox1.ImageLocation = "C:\\Users\\LENOVO\\Desktop\\5.jpg";

            }

            if (c == 6)
            {
                pictureBox1.ImageLocation = "C:\\Users\\LENOVO\\Desktop\\6.jpg";
            }


            if (d == 1)
            {
                pictureBox2.ImageLocation = "C:\\Users\\LENOVO\\Desktop\\1.jpg";
            }

            if (d == 2)
            {
                pictureBox2.ImageLocation = "C:\\Users\\LENOVO\\Desktop\\2.jpg";

            }

            if (d == 3)
            {
                pictureBox2.ImageLocation = "C:\\Users\\LENOVO\\Desktop\\3.jpg";

            }

            if (d == 4)
            {
                pictureBox2.ImageLocation = "C:\\Users\\LENOVO\\Desktop\\4.jpg";

            }

            if (d == 5)
            {
                pictureBox2.ImageLocation = "C:\\Users\\LENOVO\\Desktop\\5.jpg";

            }

            if (d == 6)
            {
                pictureBox2.ImageLocation = "C:\\Users\\LENOVO\\Desktop\\6.jpg";
            }




            toplampc = toplampc + c + d;
            label15.Text = toplampc.ToString();

            label10.Text = c.ToString();
            label9.Text = d.ToString();

            if (toplamben > 100 && toplamben > toplampc)
            {
                label13.Text = "Kazanan sizsiniz..";
            }

            if (toplampc > 100 && toplampc > toplamben)
            {
                label13.Text = "Kazanan pc siz kaybettiniz..";
            }
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            button1.Enabled = true;
            button2.Enabled = false;
        }
    }
}
