package Menu_bawah.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tugas_besar_mc.DataList;
import com.example.tugas_besar_mc.MyListAdapter;
import com.example.tugas_besar_mc.R;

public class HomeFragment extends Fragment {
    private HomeViewModel homeViewModel;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.activity__home, container, false);
        RecyclerView recyclerView = root.findViewById(R.id.recyclerview);
        MyListAdapter adapter = new MyListAdapter(setdataList());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
//        deskripsi=root.findViewById(R.id.deskripsi3);
        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

            }
        });
        return root;
    }
    public DataList[] setdataList(){
        DataList[] myListData = new DataList[]{
                new DataList(R.drawable.perpustakaanyk1,"Perpusatakaan kota", "Jl. Suroto No.9, Kotabaru, Kec. Gondokusuman, Kota Yogyakarta, Daerah Istimewa Yogyakarta 55224","Alamat: Jl. Suroto No.9, Kotabaru, Kec. Gondokusuman, Kota Yogyakarta, Daerah Istimewa Yogyakarta 55224","Jam buka: \n" +
                        "Buka 24 jam","Telepon: (0274) 511314",R.drawable.perpus_yk2,R.drawable.perpus_yk3,R.drawable.perpus_yk4,"https://www.google.com"),
                new DataList(R.drawable.perpus_uin1,"Perpustakaan Univerista Islam Yogyakarta", "Jl. Colombo No.1, Karang Malang, Caturtunggal, Kec. Depok, Kabupaten Sleman, Daerah Istimewa Yogyakarta 55281","Jl. Colombo No.1, Karang Malang, Caturtunggal, Kec. Depok, Kabupaten Sleman, Daerah Istimewa Yogyakarta 55281","Jam buka:Senin-Sabtu Minggu :Tutup ","Telepon: (0274) 548635",R.drawable.perpus_uin2,R.drawable.perpus_uin3,R.drawable.perpus_uin4,"https://translate.com"),
                new DataList(R.drawable.perpus_uny1,"Perpustakaan Universitas Yogyakarta", "Jl. Marsda Adisucipto, Demangan, Gondokusuman, Papringan, Caturtunggal, Kec. D1","Jl. Marsda Adisucipto, Demangan, Gondokusuman, Papringan, Caturtunggal, Kec. D1","Jam buka: Senin - sabtu ,Minggu :Tutup ","No Telpon: -",R.drawable.perpus_uny2,R.drawable.perpus_uny3,R.drawable.perpus_uny4,"https://sia.uty.ac.id"),
                new DataList(R.drawable.perpus_gramatama1,"Perpustakaan GramaTama ", "Jl. Janti, Wonocatur, Banguntapan, Kec. Banguntapan, Bantul, Daerah Istimewa Yogyakarta 55198","Jl. Janti, Wonocatur, Banguntapan, Kec. Banguntapan, Bantul, Daerah Istimewa Yogyakarta 5519","Jam buka : Senin - sabtu , Minggu : Tutup ","Telepon: 0881-2658-192",R.drawable.perpus_gramatama2,R.drawable.perpus_grmatama3,R.drawable.perpus_gramata4,"https://elerning.uty.ac.id"),
                new DataList(R.drawable.perpus_malbor,"Perpustakaan Malioboro ", "Jl. Malioboro No.175, Sosromenduran, Gedong Tengen, Kota Yogyakarta, Daerah Istimewa Yogyakarta 55271","Jl. Malioboro No.175, Sosromenduran, Gedong Tengen, Kota Yogyakarta, Daerah Istimewa Yogyakarta 55271","Jam buka : Senin- sabtu ,minggu :Tutup ","Telepon: (0274) 512473",R.drawable.perpus_malbor1,R.drawable.perpus_malbor2,R.drawable.perpus_malobor3,"https://www.facebok.com"),
                new DataList(R.drawable.pevita1,"EVITA (Perpustakaan Alternatif Wilayah Selatan Kota Yogyakarta ", "Jl. Mayjend Sutoyo No.32, Mantrijeron, Kec. Mantrijeron, Kota Yogyakarta, Daerah Istimewa Yogyakarta 55143","Jl. Mayjend Sutoyo No.32, Mantrijeron, Kec. Mantrijeron, Kota Yogyakarta, Daerah Istimewa Yogyakarta 55143","Jam Buka : Senin - Sabtu , Minggu :Tutup","No tel : - "
                        ,R.drawable.pevita1,R.drawable.pevita2,R.drawable.pevita3,"https://www/instragam.com"),
                new DataList(R.drawable.ugm,"Perpustakaan UGM (Universitas Gajah Mada) ", "Gadjah Mada University, Perpustakaan UGM, Jl Tri Darma No.2, Karang Malang, Caturtunggal, Kec. Depok, Kabupaten Sleman, Daerah Istimewa Yogyakarta 55281","Gadjah Mada University, Perpustakaan UGM, Jl Tri Darma No.2, Karang Malang, Caturtunggal, Kec. Depok, Kabupaten Sleman, Daerah Istimewa Yogyakarta 55281","Jam Buka : Senin - Sabtu , Minggu :Tutup","Telepon: (0274) 513163"
                        ,R.drawable.ugm1,R.drawable.ugm2,R.drawable.ugm3,"https://www/instragam.com"),
                new DataList(R.drawable.umy2,"Perpustakaan UMY(Universitas Muhammadiyah Yogyakarta) ", "Gadjah Mada University, Perpustakaan UGM, Jl Tri Darma No.2, Karang Malang, Caturtunggal, Kec. Depok, Kabupaten Sleman, Daerah Istimewa Yogyakarta 55281","Gedung D lantai 3 UMY, Jl. Brawijaya, Geblagan, Tamantirto, Kec. Kasihan, Bantul, Daerah Istimewa Yogyakarta 55184","Jam Buka : Senin - Sabtu , Minggu :Tutup","Telepon: (0274) 387656"
                        ,R.drawable.umy1,R.drawable.umy3,R.drawable.umy4,"https://www/instragam.com"),

        };
        return  myListData;
    }
}
