package com.example.fussen.bluetooth;

import android.bluetooth.BluetoothDevice;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * 蓝牙列表
 *
 * @author chris
 */
public class MyAdapter extends BaseAdapter {

    private MainActivity mainActivity;
    private List<BluetoothDevice> deviceList;

    public MyAdapter(MainActivity mainActivity, List<BluetoothDevice> data) {
        this.mainActivity = mainActivity;
        this.deviceList = data;
    }

    @Override
    public int getCount() {
        return deviceList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    public void setData(List<BluetoothDevice> data) {
        this.deviceList = data;
        notifyDataSetChanged();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View v = View.inflate(mainActivity, R.layout.item_device_list, null);

        TextView name = (TextView) v.findViewById(R.id.name);
        TextView address = (TextView) v.findViewById(R.id.adress);
        name.setText(deviceList.get(i).getName() + ": ");
        address.setText(deviceList.get(i).getAddress());
        return v;
    }
}
