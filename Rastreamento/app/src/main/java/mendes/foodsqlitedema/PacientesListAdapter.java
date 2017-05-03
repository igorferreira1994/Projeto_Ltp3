package mendes.foodsqlitedema;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by igor on 01/05/17.
 */

public class PacientesListAdapter extends BaseAdapter{

    private Context context;
    private int layout;
    private ArrayList<Pacientes> pacientesList;


    public PacientesListAdapter(Context context, int layout, ArrayList<Pacientes> pacienteList) {
        this.context = context;
        this.layout = layout;
        this.pacientesList = pacienteList;
    }

    @Override
    public int getCount() {
        return pacientesList.size();
    }

    @Override
    public Object getItem(int position) {
        return pacientesList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    private class ViewHolder{
        TextView txtNome, txtData,txtTelefone,txtCusto,txtambulatorio,txtdoenca,txtsintomas,txtmedicacao,txtconclusao;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        View row = view;
        ViewHolder holder = new ViewHolder();

        if(row == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(layout, null);
            holder.txtNome = (TextView) row.findViewById(R.id.a);
            holder.txtData = (TextView) row.findViewById(R.id.b);
            holder.txtTelefone = (TextView) row.findViewById(R.id.c);
            holder.txtCusto = (TextView) row.findViewById(R.id.d);
            holder.txtambulatorio = (TextView) row.findViewById(R.id.e);
            holder.txtdoenca = (TextView) row.findViewById(R.id.f);
            holder.txtsintomas = (TextView) row.findViewById(R.id.g);
            holder.txtmedicacao = (TextView) row.findViewById(R.id.h);
            holder.txtconclusao = (TextView) row.findViewById(R.id.i);
            row.setTag(holder);
        }
        else{
            holder = (ViewHolder) row.getTag();
        }

        Pacientes pacientes = pacientesList.get(position);

        holder.txtNome.setText(pacientes.getNome());
        holder.txtData.setText(pacientes.getData());
        holder.txtTelefone.setText(pacientes.getTelefone());
        holder.txtCusto.setText(pacientes.getCusto());
        holder.txtambulatorio.setText(pacientes.getAmbulatorio());
        holder.txtdoenca.setText(pacientes.getDoenca());
        holder.txtsintomas.setText(pacientes.getSintomas());
        holder.txtmedicacao.setText(pacientes.getMedicacao());
        holder.txtconclusao.setText(pacientes.getConclusao());

        return row;
    }
}
